import { expect, test } from 'vitest'

test('adds 1 + 2 to equal 3', () => {
    expect(1 + 2).toBe(3)
})

test('adds 1 + 2 to equal 3', async () => {
    await new Promise(resolve => setTimeout(resolve, 1000))
    expect(1 + 4).toBe(5)
})